package com.faendir.awscdkkt.generated

import javax.`annotation`.Generated
import kotlin.String
import kotlin.collections.List
import software.amazon.awscdk.GitIgnoreStrategy

@Generated
public fun gitIgnoreStrategy(absoluteRootPath: String, patterns: List<String>): GitIgnoreStrategy =
    GitIgnoreStrategy(absoluteRootPath, patterns)
