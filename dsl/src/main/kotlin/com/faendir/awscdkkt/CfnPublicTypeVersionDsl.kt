@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnPublicTypeVersion
import software.amazon.awscdk.CfnPublicTypeVersionProps
import software.constructs.Construct

public fun Construct.cfnPublicTypeVersion(
  id: String,
  props: CfnPublicTypeVersionProps,
  initializer: CfnPublicTypeVersion.() -> Unit = {},
): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id, props).apply(initializer)

public fun Construct.cfnPublicTypeVersion(id: String, initializer: CfnPublicTypeVersion.() -> Unit =
    {}): CfnPublicTypeVersion = CfnPublicTypeVersion(this, id).apply(initializer)
