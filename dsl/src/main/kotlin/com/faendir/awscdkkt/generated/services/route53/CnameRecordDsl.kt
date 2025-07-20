package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.constructs.Construct

@Generated
public fun Construct.cnameRecord(
  id: String,
  props: CnameRecordProps,
  initializer: @AwsCdkDsl CnameRecord.() -> Unit = {},
): CnameRecord = CnameRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCnameRecord(id: String, initializer: @AwsCdkDsl CnameRecord.Builder.() -> Unit = {}): CnameRecord = CnameRecord.Builder.create(this, id).apply(initializer).build()
