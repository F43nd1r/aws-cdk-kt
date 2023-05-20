@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.DsRecord
import software.amazon.awscdk.services.route53.DsRecordProps
import software.constructs.Construct

public fun Construct.dsRecord(
  id: String,
  props: DsRecordProps,
  initializer: DsRecord.() -> Unit = {},
): DsRecord = DsRecord(this, id, props).apply(initializer)
