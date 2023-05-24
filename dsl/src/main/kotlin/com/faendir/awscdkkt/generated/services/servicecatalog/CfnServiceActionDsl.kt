package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceAction(id: String, props: CfnServiceActionProps): CfnServiceAction =
    CfnServiceAction(this, id, props)

@Generated
public fun Construct.cfnServiceAction(
  id: String,
  props: CfnServiceActionProps,
  initializer: @AwsCdkDsl CfnServiceAction.() -> Unit,
): CfnServiceAction = CfnServiceAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceAction(id: String, initializer: @AwsCdkDsl
    CfnServiceAction.Builder.() -> Unit): CfnServiceAction = CfnServiceAction.Builder.create(this,
    id).apply(initializer).build()
