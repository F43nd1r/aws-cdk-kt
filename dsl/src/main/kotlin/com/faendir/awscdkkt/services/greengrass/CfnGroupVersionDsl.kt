@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
import software.constructs.Construct

public fun Construct.cfnGroupVersion(
  id: String,
  props: CfnGroupVersionProps,
  initializer: CfnGroupVersion.() -> Unit = {},
): CfnGroupVersion = CfnGroupVersion(this, id, props).apply(initializer)
