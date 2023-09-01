package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl AaaaRecord.() -> Unit = {},
): AaaaRecord = AaaaRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAaaaRecord(id: String, initializer: @AwsCdkDsl
    AaaaRecord.Builder.() -> Unit = {}): AaaaRecord = AaaaRecord.Builder.create(this,
    id).apply(initializer).build()
