@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.constructs.Construct

public fun Construct.cfnImageBuilder(
  id: String,
  props: CfnImageBuilderProps,
  initializer: CfnImageBuilder.() -> Unit = {},
): CfnImageBuilder = CfnImageBuilder(this, id, props).apply(initializer)
