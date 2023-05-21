package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import software.amazon.awscdk.services.iottwinmaker.CfnEntityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEntity(
  id: String,
  props: CfnEntityProps,
  initializer: CfnEntity.() -> Unit = {},
): CfnEntity = CfnEntity(this, id, props).apply(initializer)
