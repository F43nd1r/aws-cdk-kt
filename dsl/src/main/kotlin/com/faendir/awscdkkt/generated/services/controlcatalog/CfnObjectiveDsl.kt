package com.faendir.awscdkkt.generated.services.controlcatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controlcatalog.CfnObjective
import software.amazon.awscdk.services.controlcatalog.CfnObjectiveProps
import software.constructs.Construct

@Generated
public fun Construct.cfnObjective(id: String, initializer: @AwsCdkDsl CfnObjective.() -> Unit = {}): CfnObjective = CfnObjective(this, id).apply(initializer)

@Generated
public fun Construct.cfnObjective(
  id: String,
  props: CfnObjectiveProps,
  initializer: @AwsCdkDsl CfnObjective.() -> Unit = {},
): CfnObjective = CfnObjective(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnObjective(id: String, initializer: @AwsCdkDsl CfnObjective.Builder.() -> Unit = {}): CfnObjective = CfnObjective.Builder.create(this, id).apply(initializer).build()
