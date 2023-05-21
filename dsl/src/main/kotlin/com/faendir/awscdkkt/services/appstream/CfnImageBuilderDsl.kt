package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImageBuilder(
  id: String,
  props: CfnImageBuilderProps,
  initializer: CfnImageBuilder.() -> Unit = {},
): CfnImageBuilder = CfnImageBuilder(this, id, props).apply(initializer)
