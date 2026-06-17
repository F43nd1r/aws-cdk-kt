package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentManager
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentManagerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPaymentManager(
  id: String,
  props: CfnPaymentManagerProps,
  initializer: @AwsCdkDsl CfnPaymentManager.() -> Unit = {},
): CfnPaymentManager = CfnPaymentManager(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPaymentManager(id: String, initializer: @AwsCdkDsl CfnPaymentManager.Builder.() -> Unit = {}): CfnPaymentManager = CfnPaymentManager.Builder.create(this, id).apply(initializer).build()
