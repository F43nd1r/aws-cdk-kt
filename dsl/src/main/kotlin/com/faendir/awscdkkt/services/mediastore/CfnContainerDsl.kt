package com.faendir.awscdkkt.services.mediastore

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediastore.CfnContainer
import software.amazon.awscdk.services.mediastore.CfnContainerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContainer(
  id: String,
  props: CfnContainerProps,
  initializer: CfnContainer.() -> Unit = {},
): CfnContainer = CfnContainer(this, id, props).apply(initializer)
