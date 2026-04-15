package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnApiKeyCredentialProvider
import software.amazon.awscdk.services.bedrockagentcore.CfnApiKeyCredentialProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiKeyCredentialProvider(
  id: String,
  props: CfnApiKeyCredentialProviderProps,
  initializer: @AwsCdkDsl CfnApiKeyCredentialProvider.() -> Unit = {},
): CfnApiKeyCredentialProvider = CfnApiKeyCredentialProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiKeyCredentialProvider(id: String, initializer: @AwsCdkDsl CfnApiKeyCredentialProvider.Builder.() -> Unit = {}): CfnApiKeyCredentialProvider = CfnApiKeyCredentialProvider.Builder.create(this, id).apply(initializer).build()
