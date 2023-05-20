@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordSetProps
import software.constructs.Construct

public fun Construct.recordSet(
  id: String,
  props: RecordSetProps,
  initializer: RecordSet.() -> Unit = {},
): RecordSet = RecordSet(this, id, props).apply(initializer)
