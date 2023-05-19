@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
