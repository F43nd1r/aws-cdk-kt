@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersion
import software.amazon.awscdk.services.cloudformation.CfnPublicTypeVersionProps
import software.constructs.Construct

public fun Construct.cfnPublicTypeVersion(
  id: String,
  props: CfnPublicTypeVersionProps,
  initializer: CfnPublicTypeVersion.() -> Unit = {},
): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id, props).apply(initializer)

public fun Construct.cfnPublicTypeVersion(id: String, initializer: CfnPublicTypeVersion.() -> Unit =
    {}): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id).apply(initializer)
