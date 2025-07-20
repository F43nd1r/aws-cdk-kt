package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CaaAmazonRecord.() -> Unit = {},
): CaaAmazonRecord = CaaAmazonRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCaaAmazonRecord(id: String, initializer: @AwsCdkDsl CaaAmazonRecord.Builder.() -> Unit = {}): CaaAmazonRecord = CaaAmazonRecord.Builder.create(this, id).apply(initializer).build()
