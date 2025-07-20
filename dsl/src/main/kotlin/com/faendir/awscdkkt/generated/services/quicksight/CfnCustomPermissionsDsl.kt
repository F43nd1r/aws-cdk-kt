package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnCustomPermissions
import software.amazon.awscdk.services.quicksight.CfnCustomPermissionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomPermissions(
  id: String,
  props: CfnCustomPermissionsProps,
  initializer: @AwsCdkDsl CfnCustomPermissions.() -> Unit = {},
): CfnCustomPermissions = CfnCustomPermissions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomPermissions(id: String, initializer: @AwsCdkDsl CfnCustomPermissions.Builder.() -> Unit = {}): CfnCustomPermissions = CfnCustomPermissions.Builder.create(this, id).apply(initializer).build()
