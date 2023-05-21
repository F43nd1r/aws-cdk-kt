package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicTypeVersion(id: String, initializer: CfnPublicTypeVersion.() -> Unit =
    {}): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnPublicTypeVersion(
  id: String,
  props: CfnPublicTypeVersionProps,
  initializer: CfnPublicTypeVersion.() -> Unit = {},
): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id, props).apply(initializer)
