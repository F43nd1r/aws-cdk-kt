package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnOAuth2CredentialProvider
import software.amazon.awscdk.services.bedrockagentcore.CfnOAuth2CredentialProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOAuth2CredentialProvider(
  id: String,
  props: CfnOAuth2CredentialProviderProps,
  initializer: @AwsCdkDsl CfnOAuth2CredentialProvider.() -> Unit = {},
): CfnOAuth2CredentialProvider = CfnOAuth2CredentialProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOAuth2CredentialProvider(id: String, initializer: @AwsCdkDsl CfnOAuth2CredentialProvider.Builder.() -> Unit = {}): CfnOAuth2CredentialProvider = CfnOAuth2CredentialProvider.Builder.create(this, id).apply(initializer).build()
