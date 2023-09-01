package com.faendir.awscdkkt.generated.services.mediapackage

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPackagingGroup(
  id: String,
  props: CfnPackagingGroupProps,
  initializer: @AwsCdkDsl CfnPackagingGroup.() -> Unit = {},
): CfnPackagingGroup = CfnPackagingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPackagingGroup(id: String, initializer: @AwsCdkDsl
    CfnPackagingGroup.Builder.() -> Unit = {}): CfnPackagingGroup =
    CfnPackagingGroup.Builder.create(this, id).apply(initializer).build()
