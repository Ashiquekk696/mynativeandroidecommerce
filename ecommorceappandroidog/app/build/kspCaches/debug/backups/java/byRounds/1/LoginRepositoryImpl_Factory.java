import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LoginRepositoryImpl_Factory implements Factory<LoginRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public LoginRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public LoginRepositoryImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static LoginRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new LoginRepositoryImpl_Factory(apiServiceProvider);
  }

  public static LoginRepositoryImpl newInstance(ApiService apiService) {
    return new LoginRepositoryImpl(apiService);
  }
}
