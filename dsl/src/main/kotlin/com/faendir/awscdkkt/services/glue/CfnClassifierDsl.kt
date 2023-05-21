package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClassifier(id: String, initializer: CfnClassifier.() -> Unit = {}):
    CfnClassifier = CfnClassifier(this, id).apply(initializer)

@Generated
public fun Construct.cfnClassifier(
  id: String,
  props: CfnClassifierProps,
  initializer: CfnClassifier.() -> Unit = {},
): CfnClassifier = CfnClassifier(this, id, props).apply(initializer)
