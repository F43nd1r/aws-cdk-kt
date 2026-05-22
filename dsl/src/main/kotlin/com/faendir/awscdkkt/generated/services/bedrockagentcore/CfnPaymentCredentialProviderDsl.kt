package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentCredentialProvider
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentCredentialProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPaymentCredentialProvider(
  id: String,
  props: CfnPaymentCredentialProviderProps,
  initializer: @AwsCdkDsl CfnPaymentCredentialProvider.() -> Unit = {},
): CfnPaymentCredentialProvider = CfnPaymentCredentialProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPaymentCredentialProvider(id: String, initializer: @AwsCdkDsl CfnPaymentCredentialProvider.Builder.() -> Unit = {}): CfnPaymentCredentialProvider = CfnPaymentCredentialProvider.Builder.create(this, id).apply(initializer).build()
