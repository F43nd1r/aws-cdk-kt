@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.constructs.Construct

public fun Construct.srvRecord(
  id: String,
  props: SrvRecordProps,
  initializer: SrvRecord.() -> Unit = {},
): SrvRecord = SrvRecord(this, id, props).apply(initializer)
