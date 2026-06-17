package com.faendir.awscdkkt.generated.services.resiliencehubv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehubv2.CfnSystem
import software.amazon.awscdk.services.resiliencehubv2.CfnSystemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSystem(
  id: String,
  props: CfnSystemProps,
  initializer: @AwsCdkDsl CfnSystem.() -> Unit = {},
): CfnSystem = CfnSystem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSystem(id: String, initializer: @AwsCdkDsl CfnSystem.Builder.() -> Unit = {}): CfnSystem = CfnSystem.Builder.create(this, id).apply(initializer).build()
