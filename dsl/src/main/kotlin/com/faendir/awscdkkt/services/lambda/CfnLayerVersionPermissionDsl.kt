package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayerVersionPermission(
  id: String,
  props: CfnLayerVersionPermissionProps,
  initializer: CfnLayerVersionPermission.() -> Unit = {},
): CfnLayerVersionPermission = CfnLayerVersionPermission(this, id, props).apply(initializer)
