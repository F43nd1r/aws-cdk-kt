package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowserCustom
import software.amazon.awscdk.services.bedrockagentcore.CfnBrowserCustomProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBrowserCustom(
  id: String,
  props: CfnBrowserCustomProps,
  initializer: @AwsCdkDsl CfnBrowserCustom.() -> Unit = {},
): CfnBrowserCustom = CfnBrowserCustom(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBrowserCustom(id: String, initializer: @AwsCdkDsl CfnBrowserCustom.Builder.() -> Unit = {}): CfnBrowserCustom = CfnBrowserCustom.Builder.create(this, id).apply(initializer).build()
