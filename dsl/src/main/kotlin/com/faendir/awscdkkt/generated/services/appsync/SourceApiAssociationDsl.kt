package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.SourceApiAssociation
import software.amazon.awscdk.services.appsync.SourceApiAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.sourceApiAssociation(
  id: String,
  props: SourceApiAssociationProps,
  initializer: @AwsCdkDsl SourceApiAssociation.() -> Unit = {},
): SourceApiAssociation = SourceApiAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSourceApiAssociation(id: String, initializer: @AwsCdkDsl
    SourceApiAssociation.Builder.() -> Unit = {}): SourceApiAssociation =
    SourceApiAssociation.Builder.create(this, id).apply(initializer).build()
