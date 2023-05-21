package com.faendir.awscdkkt.services.mediapackage

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
  initializer: CfnPackagingGroup.() -> Unit = {},
): CfnPackagingGroup = CfnPackagingGroup(this, id, props).apply(initializer)
