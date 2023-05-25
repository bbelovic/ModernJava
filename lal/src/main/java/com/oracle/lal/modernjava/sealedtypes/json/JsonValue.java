package com.oracle.lal.modernjava.sealedtypes.json;

public sealed class JsonValue permits JSONArray, JSONNumber, JSONString {
}
