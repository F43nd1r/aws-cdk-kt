package com.faendir.awscdkkt.generated.services.applicationsignals

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjective
import software.amazon.awscdk.services.applicationsignals.CfnServiceLevelObjectiveProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceLevelObjective(
  id: String,
  props: CfnServiceLevelObjectiveProps,
  initializer: @AwsCdkDsl CfnServiceLevelObjective.() -> Unit = {},
): CfnServiceLevelObjective = CfnServiceLevelObjective(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceLevelObjective(id: String, initializer: @AwsCdkDsl CfnServiceLevelObjective.Builder.() -> Unit = {}): CfnServiceLevelObjective = CfnServiceLevelObjective.Builder.create(this, id).apply(initializer).build()
