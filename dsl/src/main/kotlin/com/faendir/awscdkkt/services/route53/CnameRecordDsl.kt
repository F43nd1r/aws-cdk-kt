@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.constructs.Construct

public fun Construct.cnameRecord(
  id: String,
  props: CnameRecordProps,
  initializer: CnameRecord.() -> Unit = {},
): CnameRecord = CnameRecord(this, id, props).apply(initializer)
