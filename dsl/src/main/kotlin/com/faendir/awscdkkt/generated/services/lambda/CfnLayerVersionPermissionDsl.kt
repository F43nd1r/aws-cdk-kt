package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayerVersionPermission(id: String, props: CfnLayerVersionPermissionProps):
    CfnLayerVersionPermission = CfnLayerVersionPermission(this, id, props)

@Generated
public fun Construct.cfnLayerVersionPermission(
  id: String,
  props: CfnLayerVersionPermissionProps,
  initializer: @AwsCdkDsl CfnLayerVersionPermission.() -> Unit,
): CfnLayerVersionPermission = CfnLayerVersionPermission(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLayerVersionPermission(id: String, initializer: @AwsCdkDsl
    CfnLayerVersionPermission.Builder.() -> Unit): CfnLayerVersionPermission =
    CfnLayerVersionPermission.Builder.create(this, id).apply(initializer).build()
