@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
