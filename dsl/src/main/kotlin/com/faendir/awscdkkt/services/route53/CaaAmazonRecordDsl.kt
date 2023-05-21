package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CaaAmazonRecord
import software.amazon.awscdk.services.route53.CaaAmazonRecordProps
import software.constructs.Construct

@Generated
public fun Construct.caaAmazonRecord(
  id: String,
  props: CaaAmazonRecordProps,
  initializer: CaaAmazonRecord.() -> Unit = {},
): CaaAmazonRecord = CaaAmazonRecord(this, id, props).apply(initializer)
