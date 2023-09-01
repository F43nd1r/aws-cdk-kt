package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.ArchiveProps
import software.constructs.Construct

@Generated
public fun Construct.archive(
  id: String,
  props: ArchiveProps,
  initializer: @AwsCdkDsl Archive.() -> Unit = {},
): Archive = Archive(this, id, props).apply(initializer)

@Generated
public fun Construct.buildArchive(id: String, initializer: @AwsCdkDsl Archive.Builder.() -> Unit =
    {}): Archive = Archive.Builder.create(this, id).apply(initializer).build()
