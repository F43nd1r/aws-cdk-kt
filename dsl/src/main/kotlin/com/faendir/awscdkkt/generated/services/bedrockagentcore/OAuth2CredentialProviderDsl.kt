package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.OAuth2CredentialProvider
import software.amazon.awscdk.services.bedrockagentcore.OAuth2CredentialProviderProps
import software.constructs.Construct

@Generated
public fun Construct.oAuth2CredentialProvider(
  id: String,
  props: OAuth2CredentialProviderProps,
  initializer: @AwsCdkDsl OAuth2CredentialProvider.() -> Unit = {},
): OAuth2CredentialProvider = OAuth2CredentialProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOAuth2CredentialProvider(id: String, initializer: @AwsCdkDsl OAuth2CredentialProvider.Builder.() -> Unit = {}): OAuth2CredentialProvider = OAuth2CredentialProvider.Builder.create(this, id).apply(initializer).build()
