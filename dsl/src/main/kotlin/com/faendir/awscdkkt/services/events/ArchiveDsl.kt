package com.faendir.awscdkkt.services.events

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
  initializer: Archive.() -> Unit = {},
): Archive = Archive(this, id, props).apply(initializer)
