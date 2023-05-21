package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.constructs.Construct

@Generated
public fun Construct.srvRecord(
  id: String,
  props: SrvRecordProps,
  initializer: SrvRecord.() -> Unit = {},
): SrvRecord = SrvRecord(this, id, props).apply(initializer)
