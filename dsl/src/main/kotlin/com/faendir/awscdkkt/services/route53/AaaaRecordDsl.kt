package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.AaaaRecord
import software.amazon.awscdk.services.route53.AaaaRecordProps
import software.constructs.Construct

@Generated
public fun Construct.aaaaRecord(
  id: String,
  props: AaaaRecordProps,
  initializer: AaaaRecord.() -> Unit = {},
): AaaaRecord = AaaaRecord(this, id, props).apply(initializer)
