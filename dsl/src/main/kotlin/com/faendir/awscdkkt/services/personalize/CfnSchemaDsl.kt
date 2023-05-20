@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSchema
import software.amazon.awscdk.services.personalize.CfnSchemaProps
import software.constructs.Construct

public fun Construct.cfnSchema(
  id: String,
  props: CfnSchemaProps,
  initializer: CfnSchema.() -> Unit = {},
): CfnSchema = CfnSchema(this, id, props).apply(initializer)
