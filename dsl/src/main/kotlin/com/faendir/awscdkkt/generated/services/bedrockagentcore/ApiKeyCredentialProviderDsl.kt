package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.ApiKeyCredentialProvider
import software.amazon.awscdk.services.bedrockagentcore.ApiKeyCredentialProviderProps
import software.constructs.Construct

@Generated
public fun Construct.apiKeyCredentialProvider(id: String, initializer: @AwsCdkDsl ApiKeyCredentialProvider.() -> Unit = {}): ApiKeyCredentialProvider = ApiKeyCredentialProvider(this, id).apply(initializer)

@Generated
public fun Construct.apiKeyCredentialProvider(
  id: String,
  props: ApiKeyCredentialProviderProps,
  initializer: @AwsCdkDsl ApiKeyCredentialProvider.() -> Unit = {},
): ApiKeyCredentialProvider = ApiKeyCredentialProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApiKeyCredentialProvider(id: String, initializer: @AwsCdkDsl ApiKeyCredentialProvider.Builder.() -> Unit = {}): ApiKeyCredentialProvider = ApiKeyCredentialProvider.Builder.create(this, id).apply(initializer).build()
