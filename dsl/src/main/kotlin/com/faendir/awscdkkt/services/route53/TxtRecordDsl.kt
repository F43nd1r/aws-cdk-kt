package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.TxtRecord
import software.amazon.awscdk.services.route53.TxtRecordProps
import software.constructs.Construct

@Generated
public fun Construct.txtRecord(
  id: String,
  props: TxtRecordProps,
  initializer: TxtRecord.() -> Unit = {},
): TxtRecord = TxtRecord(this, id, props).apply(initializer)
