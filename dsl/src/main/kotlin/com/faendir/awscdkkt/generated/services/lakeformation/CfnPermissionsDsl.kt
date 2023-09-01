package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPermissions(
  id: String,
  props: CfnPermissionsProps,
  initializer: @AwsCdkDsl CfnPermissions.() -> Unit = {},
): CfnPermissions = CfnPermissions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPermissions(id: String, initializer: @AwsCdkDsl
    CfnPermissions.Builder.() -> Unit = {}): CfnPermissions = CfnPermissions.Builder.create(this,
    id).apply(initializer).build()
