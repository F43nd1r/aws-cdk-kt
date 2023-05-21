package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppBlock(
  id: String,
  props: CfnAppBlockProps,
  initializer: CfnAppBlock.() -> Unit = {},
): CfnAppBlock = CfnAppBlock(this, id, props).apply(initializer)
