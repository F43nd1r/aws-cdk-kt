package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnEnvironmentActions
import software.amazon.awscdk.services.datazone.CfnEnvironmentActionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEnvironmentActions(
  id: String,
  props: CfnEnvironmentActionsProps,
  initializer: @AwsCdkDsl CfnEnvironmentActions.() -> Unit = {},
): CfnEnvironmentActions = CfnEnvironmentActions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEnvironmentActions(id: String, initializer: @AwsCdkDsl
    CfnEnvironmentActions.Builder.() -> Unit = {}): CfnEnvironmentActions =
    CfnEnvironmentActions.Builder.create(this, id).apply(initializer).build()
