package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordSetProps
import software.constructs.Construct

@Generated
public fun Construct.recordSet(id: String, props: RecordSetProps): RecordSet = RecordSet(this, id,
    props)

@Generated
public fun Construct.recordSet(
  id: String,
  props: RecordSetProps,
  initializer: @AwsCdkDsl RecordSet.() -> Unit,
): RecordSet = RecordSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRecordSet(id: String, initializer: @AwsCdkDsl
    RecordSet.Builder.() -> Unit): RecordSet = RecordSet.Builder.create(this,
    id).apply(initializer).build()
