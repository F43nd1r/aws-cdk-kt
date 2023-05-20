@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockProps
import software.constructs.Construct

public fun Construct.cfnAppBlock(
  id: String,
  props: CfnAppBlockProps,
  initializer: CfnAppBlock.() -> Unit = {},
): CfnAppBlock = CfnAppBlock(this, id, props).apply(initializer)
