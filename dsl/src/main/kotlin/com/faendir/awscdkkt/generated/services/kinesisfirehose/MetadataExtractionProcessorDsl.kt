package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.services.kinesisfirehose.MetadataExtractionProcessor

@Generated
public fun buildMetadataExtractionProcessor(keys: List<String>, initializer: @AwsCdkDsl MetadataExtractionProcessor.Builder.() -> Unit = {}): MetadataExtractionProcessor = MetadataExtractionProcessor.Builder.create(keys).apply(initializer).build()
