package es.unican.istr.mortadelo.columnFamilyDataModel.run;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class GenerateCassandra {
  public static void main(final String[] args) {
    try {
      final String example = "eCommerce";
      InputOutput.<String>println("Cassandra schema generation");
      InputOutput.<String>println(String.format("Example: %s", example));
      final long totalStart = System.currentTimeMillis();
      final String resourcesFolder = "../es.unican.istr.mortadelo.gdm.examples/columnFamily";
      final EmfModel cfDataModel = new EmfModel();
      final StringProperties properties = new StringProperties();
      properties.put(EmfModel.PROPERTY_NAME, "columnFamilyDataModel");
      properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, 
        URI.createURI("model/columnFamilyDataModel.ecore".toString()));
      String _format = String.format("%s/%sCF.model", resourcesFolder, example);
      final File inputFile = new File(_format);
      properties.put(EmfModel.PROPERTY_MODEL_URI, 
        URI.createURI(inputFile.getCanonicalPath()));
      properties.put(EmfModel.PROPERTY_READONLOAD, Boolean.valueOf(true));
      properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, Boolean.valueOf(false));
      cfDataModel.load(properties, ((IRelativePathResolver) null));
      EglTemplateFactory _eglTemplateFactory = new EglTemplateFactory();
      final EglTemplateFactoryModuleAdapter templateModule = new EglTemplateFactoryModuleAdapter(_eglTemplateFactory);
      File _file = new File("epsilon/cassandra/columnFamilyDataModel2cassandra.egl");
      templateModule.parse(_file);
      int _size = templateModule.getParseProblems().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        System.err.println("Parse errors occured...");
        List<ParseProblem> _parseProblems = templateModule.getParseProblems();
        for (final ParseProblem problem : _parseProblems) {
          System.err.println(problem.toString());
        }
        return;
      }
      templateModule.getContext().getModelRepository().addModel(cfDataModel);
      final long start = System.currentTimeMillis();
      final Object result = templateModule.execute();
      final long end = System.currentTimeMillis();
      templateModule.getContext().getModelRepository().dispose();
      String _format_1 = String.format("%s/%s.cql", resourcesFolder, example);
      final File outputFile = new File(_format_1);
      String _parent = outputFile.getParent();
      new File(_parent).mkdirs();
      String _canonicalPath = outputFile.getCanonicalPath();
      final PrintWriter out = new PrintWriter(_canonicalPath);
      out.println(result);
      out.close();
      final long totalEnd = System.currentTimeMillis();
      InputOutput.<String>println("Generation finished");
      InputOutput.<String>println(String.format("Transformation time: %d ms", Long.valueOf((end - start))));
      InputOutput.<String>println(
        String.format("Total time (read/write files and models): %d ms", 
          Long.valueOf((totalEnd - totalStart))));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
