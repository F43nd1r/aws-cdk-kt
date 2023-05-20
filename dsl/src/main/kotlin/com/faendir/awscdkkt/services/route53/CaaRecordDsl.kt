@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordProps
import software.constructs.Construct

public fun Construct.caaRecord(
  id: String,
  props: CaaRecordProps,
  initializer: CaaRecord.() -> Unit = {},
): CaaRecord = CaaRecord(this, id, props).apply(initializer)
