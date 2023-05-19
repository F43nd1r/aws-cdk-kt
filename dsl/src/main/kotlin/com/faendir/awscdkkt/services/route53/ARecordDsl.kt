@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.ARecord
import software.amazon.awscdk.services.route53.ARecordProps
import software.constructs.Construct

public fun Construct.aRecord(
  id: String,
  props: ARecordProps,
  initializer: ARecord.() -> Unit = {},
): ARecord = ARecord(this, id, props).apply(initializer)
