package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.NsRecord
import software.amazon.awscdk.services.route53.NsRecordProps
import software.constructs.Construct

@Generated
public fun Construct.nsRecord(
  id: String,
  props: NsRecordProps,
  initializer: NsRecord.() -> Unit = {},
): NsRecord = NsRecord(this, id, props).apply(initializer)
